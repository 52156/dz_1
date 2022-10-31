package lesson5;

    public class staff {
        String fullName;
        String jobTitle;
        String email;
        String telephone;
        int wage;
        int age;

        public staff(String fullName, String jobTitle, String email, String telephone, int wage, int age) {
            this.fullName = fullName.toUpperCase();
            this. jobTitle = jobTitle;
            this.email = email;
            this.telephone = telephone;
            this.wage = wage;
            this.age = age;
        }

        void printInfo() {
            System.out.println(String.format("ФИО: %s \nДожность: %s \nEmail: %s \nТелефон: %s \nЗарплата: %s \nВозраст: %s",fullName,jobTitle,email,telephone,wage,age));
            System.out.println();
        }

    }

