package org.northcoders.config;

public class ConfigManager {
        private String databaseUrl;
        private int connectionTimeout;
        private int requestTimeout;

        private static ConfigManager instance;

        private static int dataCounter = 0;

        private ConfigManager() {
            this.databaseUrl = "https://example.com/db/url";
            this.connectionTimeout = 2000;
            this.requestTimeout = 1000;
        }

    public static ConfigManager getInstance() {
        if (instance == null) {
            return new ConfigManager();
        }

            return instance;
    }

    public String getDatabaseUrl() {
            return databaseUrl;
        }

        public void setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
        }

        public int getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }

        public int getRequestTimeout() {
            return requestTimeout;
        }

        public void setRequestTimeout(int requestTimeout) {
            this.requestTimeout = requestTimeout;
        }

    public int getDataCounter() {
        return dataCounter;
    }

    public void setDataCounter(int dataCounter) {
        this.dataCounter = dataCounter;
    }

    public void incrementDataCount() {
        this.dataCounter++;
    }

    public void decrementDataCount() {
        this.dataCounter--;
    }
}
