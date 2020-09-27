package de.taron10lp.rust.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ManagedFile {

    private String filename;
    private String filepath;

    private File file;
    private FileConfiguration configuration;


    public ManagedFile(String filepath, String filename) {
        this.filename = filename;
        this.filepath = filepath;

        file = new File(filepath, filename);
        configuration = YamlConfiguration.loadConfiguration(file);

        saveConfig();
    }

    public void saveConfig(){
        try {
            configuration.save(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getFilename() {
        return filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public File getFile() {
        return file;
    }

    public FileConfiguration getConfiguration() {
        return configuration;
    }
}
