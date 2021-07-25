/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malayalamkeyboard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aswathy
 */
public class InscriptJson {
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    private List<Chara> getObject(String path) {
        Type type = new TypeToken<List<Chara>>() {
        }.getType();
        try {
            return gson.fromJson(new FileReader(path), type);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InscriptJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    class Chara {
        
        transient static final String PRE = "\\u";
        
        @SerializedName("char")
        char c;
        @SerializedName("unicode")
        String unicode;
        
        @Override
        public String toString() {
            return "Chara{" + "c=" + c + ", unicode=" + getUniChar() + '}';
        }
        
        public long getUniChar() {
            return Long.parseLong(unicode, 16);
        }
        
    }
    
    public static void main(String[] args) {
        InscriptJson inscriptJson = new InscriptJson();
        List<Chara> list = inscriptJson.getObject("USER/keyboard/malayalam_inscript.json");

//        System.out.println("list="+list);
        list.forEach(a -> {
            try {
                System.out.println("" + (char) Integer.parseInt(a.unicode, 16));
            } catch (Exception e) {
                System.out.println("c= " + a.c);
                System.exit(0);
            }
        });

//String a="0d13";
//String hex = "f135";
//        int intu = Integer.parseInt(a, 16);
//        System.out.println(""+(char)intu);
    }
}
