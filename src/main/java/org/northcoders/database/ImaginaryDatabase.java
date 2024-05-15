package org.northcoders.database;

import org.northcoders.config.ConfigManager;

/**
 * This class is a fictional database implementation that saves data if there's any waiting to be saved
 */
public class ImaginaryDatabase {
    public static void flushDataQueue(){
        // let's see if there's any data waiting to be saved
        var config = new ConfigManager("https://example.com/db/url", 1000, 2000);

        if(config.getDataCounter() > 0){
            System.out.println("YES - Saving " + config.getDataCounter() + " pieces of data.");
        }else{
            System.out.println("No data to be saved.");
        }
    }
}
