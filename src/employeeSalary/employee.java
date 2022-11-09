package employeeSalary;

public class employee {
    String name;
    int salary;
    int workhours;
    int hireYear;
    double newSalary;

    employee(String name, int salary, int workhours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;

    }

    double tax() {
        double tax = 0.0;
        if (this.salary < 1000) {
            System.out.println("Maaşınıza vergi uygulanmayacaktır.");
        } else if (this.salary >= 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    double bonus() {
        double bonus = 0.0;
        if (this.workhours < 40) {
            System.out.println("Maaşınızda artış olmayacak.");
        } else {
            bonus = (this.workhours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        double raisesalary = 0.0;
        if (this.hireYear < 10) {
            raisesalary = this.salary * 0.05;
        } else if (this.hireYear > 9 && this.hireYear < 20) {
            raisesalary = this.salary * 0.1;
        } else if (this.hireYear > 19) {
            raisesalary = this.salary * 0.15;
        }
        return raisesalary;
    }

    void bastir() {
        System.out.print("Adı:" + this.name);
        System.out.println("Maaşı:" + this.salary);
        System.out.println("Çalışma Saati:" + this.workhours);
        System.out.println("Vergi:" + tax());
        System.out.println("Bonus:" + bonus());
        System.out.println("Maaş Artışı:" + raiseSalary());
        newSalary = this.salary - tax() + bonus() + raiseSalary();
        System.out.println("Toplam maaş:" + newSalary);

    }

}
