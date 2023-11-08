// import Model.EmployeeModel

class EmployeeService extends EmployeeModel {
    //a function to set the values of the employees
    static EmployeeModel setEmployeeData(int id, String name, long salary, String designation){ 
        EmployeeModel employees = new EmployeeModel();
        employees.setId(id);
        employees.setName(name);
        employees.setSalary(salary);
        employees.setDesignation(designation);
        return employees;
    }
    static void main(String[] args){
        List<EmployeeModel> employeeList = []; //creating an empty list of Employees type
        //adding data to the list
        int id;
        String name;
        long salary;
        String designation;
        def reader = new BufferedReader(new InputStreamReader(System.in));
        // for (def iterator = 1; iterator <= 5; iterator++) {
            try {
                println("Enter id: ");
                id = reader.readLine();;
                println("Enter name: ");
                name = reader.readLine();
                println("Enter salary: ");
                salary = Long.parseLong(reader.readLine());
                println("Enter designation: ");
                designation = reader.readLine();
                employeeList.add(setEmployeeData(id, name, salary, designation))
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid number.");
            }
        // }
        reader.close(); // Close the BufferedReader
        for (EmployeeModel employee : employeeList) {
            // if (employee.getId() == 3) {
            //     println("Employee found : ${employee.getName()}");
            //     break;
            // }
            println("Id: ${employee.id}, name: ${employee.name}, salary: ${employee.salary}, designation: ${employee.designation}")
        }
    }
}
class EmployeeModel {
    /*
    declaring private variable so they are not accessible outside the class
    */
    private int id;
    private String name;
    private long salary;
    private String designation;
    // using getter and setters for the declared variables
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
    public long getSalary(){
        return salary;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return designation;
    }
}