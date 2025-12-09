class Student { 
    private String name;     
    private String id;     
    private double cgpa;     

    // Setters
    public void setName(String n) { name = n; } 
    public void setId(String i) { id = i; } 
    public void setCgpa(double c) { cgpa = c; } 

    // Getters
    public String getName() { return name; } 
    public String getId() { return id; } 
    public double getCgpa() { return cgpa; } 

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("AlJaber");
        s1.setId("E251002");
        s1.setCgpa(3.408);

        System.out.println("Student Info:");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}
