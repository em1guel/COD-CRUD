/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Renato
 */
public class Propriedades {
    
    private static Properties prop;
    //aqui você pode mudar o nome e a extensão do arquivo
    private static String path = "config.properties";
    
        private static void LoadPropertiesFile() throws IOException {
        prop = new Properties();
        File f = new File(path);

        if (f.isFile()) {
            FileInputStream file = new FileInputStream(f);
            prop.load(file);
        } else {
            //se o arquivo não existir, cria um novo
            f.createNewFile();
            FileInputStream file = new FileInputStream(f);
            prop.load(file);
            //seta um valor inicial em branco pro parametro do LAF
            // isso é para evitar NullPointerException ao chamar
            // getLookAndFeel() logo após criar o arquivo
            setLookAndFeel("");
        }
    }

    public static String getLookAndFeel() throws IOException {
        LoadPropertiesFile();
        return prop.getProperty("lookandfeel.name");
    }

    public static void setLookAndFeel(String name) throws IOException {
        LoadPropertiesFile();
        prop.setProperty("lookandfeel.name", name);
        prop.store(new FileOutputStream(path), "");
    }
}

