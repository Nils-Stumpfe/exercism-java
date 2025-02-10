class Badge {
    // looked at uzilan's solution
    // https://exercism.org/tracks/java/exercises/tim-from-marketing/solutions/uzilan
    public String print(Integer id, String name, String department) {
        String dep = (department == null) ? "OWNER" : department.toUpperCase();
        String idString = (id == null) ? "" : "[" + id + "] - ";
        return idString + name + " - " +  dep;
    }
}
