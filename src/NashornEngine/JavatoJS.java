package NashornEngine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavatoJS {

    public static void main(String[] args) {

        ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");
        
        try {
            nashorn.eval("print('Am I Java or JavaScript?')");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

}