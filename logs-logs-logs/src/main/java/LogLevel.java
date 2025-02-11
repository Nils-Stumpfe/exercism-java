public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("UKW", 0);

    private final String abriviation;
    private final int encoding;

    LogLevel(String abriviation, int encoding) {
        this.abriviation = abriviation;
        this.encoding = encoding;
    }

    // looked at florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/logs-logs-logs/solutions/florian-zeidler
    public static LogLevel getLogLevel(String abriviation) {
        for (LogLevel level : LogLevel.values()) {
            if (level.abriviation.equals(abriviation)) {
                return level;
            }
        }
        return UNKNOWN;
    }

    public int getEncodedLevel() {
        return encoding;
    }
}
