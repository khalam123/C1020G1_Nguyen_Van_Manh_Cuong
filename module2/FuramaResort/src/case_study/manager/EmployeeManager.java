package case_study.manager;

import case_study.model.Employee;

import java.util.*;

import static case_study.commons.FileCSV.fileReader;

public class EmployeeManager {
    static String pathFile = "src/case_study/data/Employee.csv";

        public static void showEmployee(){

//            List<Employee> listEmployee = new ArrayList<>();
//            listEmployee.add(new Employee(1,"A",25,"DN"));
//            listEmployee.add(new Employee(2,"B",21,"DN"));
//            listEmployee.add(new Employee(3,"C",25,"DN"));
//            listEmployee.add(new Employee(4,"D",22,"DN"));
//            listEmployee.add(new Employee(5,"E",24,"DN"));
//            listEmployee.add(new Employee(6,"F",27,"DN"));
//            listEmployee.add(new Employee(7,"G",26,"DN"));
//            listEmployee.add(new Employee(8,"H",20,"DN"));
//            listEmployee.add(new Employee(9,"I",23,"DN"));
//            listEmployee.add(new Employee(10,"K",22,"DN"));
//            String line = "";
//            for (int i = 0; i < listEmployee.size() ; i++) {
//                line = listEmployee.get(i).getIdEmployee() + "," + listEmployee.get(i).getNameEmployee()+
//                        "," + listEmployee.get(i).getAge() + "," +listEmployee.get(i).getAddress();
//                FileCSV.fileWriter(pathFile,line);
//            }
//            List<String> listEmployee1 =  fileReader("src/case_study/data/Employee.csv");
//            for (int i = 0; i < listEmployee1.size(); i++) {
//                System.out.println(listEmployee1.get(i));
//            }
            List<String> employeeMap = fileReader("src/case_study/data/Employee.csv");
            Map<Integer,Employee> employeeMap1 = new HashMap<>();
            for (int i = 0; i < employeeMap.size() ; i++) {
                String[] temp = employeeMap.get(i).split(",");
                String id = temp[0];
                String name = temp[1];
                String age = temp[2];
                String address = temp[3];
                Employee employee = new Employee(Integer.parseInt(id), name, Integer.parseInt(age), address);
                employeeMap1.put(employee.getIdEmployee(), employee);
            }
             Set<Integer> keySet = employeeMap1.keySet();
            for (Integer key: keySet)
                System.out.println(employeeMap1.get(key));
//            Map<Integer,Employee> employee = new HashMap<>();
//            for (Employee value : listEmployee) {
//                employee.put(value.getIdEmployee(), value);
//            }
//            Set<Integer> keyset = employee.keySet();
//            for(Integer key : keyset){
//                System.out.println(key + " - " + employee.get(key));
//            }
        }

}
