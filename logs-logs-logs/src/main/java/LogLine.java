public class LogLine {

    private String line;

    public LogLine(String logLine) {
        line = logLine;
    }

    public LogLevel getLogLevel() {
        return LogLevel.getLogLevel(line.substring(1,4));
    }

    public String getOutputForShortLog() {
         int encodig = this.getLogLevel().getEncodedLevel();
         String message = line.substring(7);
         return String.format("%s:%s", encodig, message);
        
    }
}
