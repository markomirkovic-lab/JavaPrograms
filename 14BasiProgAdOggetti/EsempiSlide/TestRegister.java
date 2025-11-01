class Student {
    String firstName;
    String lastName;
    double[] grades;
    int gradeCount;

    Student(String firstName, String lastName, int numGrades) {
        this.firstName = firstName;
        this.lastName = lastName;
        grades = new double[numGrades <= 0 ? 5 : numGrades];
    }

    boolean addGrade(double grade) {
        if (grade < 1 || grade > 6)
            return false;

        if (gradeCount == grades.length)
            return false;

        grades[gradeCount++] = grade;
        return true;
    }

    void show() {
        System.out.println(firstName + " " + lastName);
        System.out.print("Grades: ");
        if (gradeCount == 0)
            System.out.print("None");
        else
            for (int i = 0; i < gradeCount; i++)
                System.out.print(grades[i] + " ");
        System.out.println();
    }
}

class Register {
    String className;
    Student[] students;//  un array di oggetti di tipo Student che rappresenta gli studenti iscritti
    int studentCount;

    Register(String className, int numStudents) {
        this.className = className;
        students = new Student[numStudents <= 0 ? 15 : numStudents];
    }

    boolean addStudent(Student student) {
        if (student == null)
            return false;

        if (studentCount == students.length)
            return false;

        students[studentCount++] = student;
        return true;
    }

    boolean addGrade(String firstName, String lastName, double grade) {
        if (firstName == null || lastName == null)
            return false;

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];//?????????????????????????????????????????????????????
            // nel metodo addGrade della classe Register ha lo scopo di accedere a uno studente 
            // specifico all'interno dell'array students
            /*
            Accesso all'elemento dell'array:

            students è un array di oggetti di tipo Student.

            students[i] accede all'elemento nella posizione i dell'array students.

            Questo elemento è un oggetto di tipo Student.

            Assegnazione a una variabile locale:

            La riga Student student = students[i]; assegna l'oggetto Student trovato nella posizione i 
            dell'array a una variabile locale chiamata student.

            Questa variabile locale (student) è di tipo Student e permette di lavorare direttamente 
            con l'oggetto Student senza dover riscrivere students[i] ogni volta.

            Utilizzo della variabile locale:

            Dopo aver assegnato students[i] alla variabile student, puoi usare student per accedere 
            ai campi o ai metodi dell'oggetto Student.

            Nel codice, la riga successiva verifica se il nome e il cognome dello studente corrispondono 
            a quelli passati come parametro:
            if (firstName.equals(student.firstName) && lastName.equals(student.lastName))
            Se la condizione è vera, viene chiamato il metodo addGrade sull'oggetto student:

            return student.addGrade(grade);
            Perché è utile questa riga?
            La riga Student student = students[i]; è utile per:

            Migliorare la leggibilità del codice:

            Invece di scrivere students[i].firstName e students[i].lastName, puoi usare 
            student.firstName e student.lastName, che è più chiaro e conciso.

            Evitare ripetizioni:

            Senza questa riga, dovresti scrivere students[i] ogni volta che vuoi accedere 
            ai campi o ai metodi dello studente. Questo renderebbe il codice più verboso e 
            meno leggibile.

            Favorire il riutilizzo:

            Se in futuro dovessi aggiungere altre operazioni sullo studente trovato, puoi 
            farlo direttamente usando la variabile student senza dover ripetere students[i].

            Esempio di flusso del metodo addGrade
            Il metodo addGrade riceve come parametri:

            firstName: il nome dello studente.
            lastName: il cognome dello studente.
            grade: il voto da aggiungere.

            Il metodo scorre l'array students usando un ciclo for:

            for (int i = 0; i < studentCount; i++)
            Per ogni iterazione del ciclo:

            Assegna l'elemento students[i] alla variabile student:

            Student student = students[i];
            Verifica se il nome e il cognome dello studente corrispondono a quelli passati 
            come parametro:

            if (firstName.equals(student.firstName) && lastName.equals(student.lastName))
            Se corrispondono, chiama il metodo addGrade sull'oggetto student e restituisce true:

            return student.addGrade(grade);
            Se il ciclo termina senza trovare uno studente con il nome e cognome specificati, 
            il metodo restituisce false.

            Esempio pratico
            Supponiamo che l'array students contenga i seguenti oggetti:

            students = [
                Student("Mario", "Rossi"),
                Student("Luigi", "Verdi"),
                Student("Giovanna", "Bianchi")
            ];
            Se chiami il metodo addGrade con i parametri "Luigi", "Verdi" e 8.5, il metodo:

            Scorre l'array students.

            Trova lo studente "Luigi Verdi" nella posizione 1.

            Assegna students[1] alla variabile student.

            Verifica che "Luigi" e "Verdi" corrispondano ai campi firstName e lastName di student.

            Chiama student.addGrade(8.5) per aggiungere il voto.

            Conclusione
            La riga Student student = students[i]; è un'operazione di accesso e assegnazione 
            che permette di lavorare in modo più efficiente e leggibile con l'oggetto Student 
            corrente durante l'iterazione dell'array students. Senza di essa, il codice sarebbe 
            più verboso e meno chiaro.


            */
            if (firstName.equals(student.firstName) && lastName.equals(student.lastName))
                return student.addGrade(grade);// == return true
        }
        return false;
    }

    void show() {
        System.out.println("\nClass: " + className);
        if (studentCount == 0)
            System.out.println("No students");
        else
            for (int i = 0; i < studentCount; i++)
                students[i].show();
        System.out.println();
    }
}

public class TestRegister {
    public static void main(String[] args) {
        Register register = new Register("I1", 28);// class I1, 28 student

        if (!register.addStudent(new Student("Mario", "Rossi", 10)))
            System.out.println("Unable to add Mario Rossi");
        if (!register.addStudent(new Student("Flavia", "Bianchi", -5)))
            System.out.println("Unable to add Flavia Bianchi");
        if (!register.addStudent(null))//student: null -> errore
            System.out.println("Unable to add the student");

        register.show();

        if (!register.addGrade("Mario", "Rossi", 3.5))
            System.out.println("Unable to add grade 3.5 to Mario Rossi");
        if (!register.addGrade("Flavia", "Bianchi", 5.75))
            System.out.println("Unable to add grade 5.75 to Flavia Bianchi");
        if (!register.addGrade("Mario", "Rossi", 4.25))
            System.out.println("Unable to add grade 4.25 to Mario Rossi");
        if (!register.addGrade("Flavia", "Rossi", -1.5))//Flavia Bianchi non rossi -> errore
            System.out.println("Unable to add grade -1.5 to Flavia Rossi");
        if (!register.addGrade("Flavia", null, 1.75))//last name: null -> errore
            System.out.println("Unable to add grade 1.75 to Flavia");

        register.show();

        /*
        Unable to add the student

        Class: I1
        Mario Rossi
        Grades: None
        Flavia Bianchi
        Grades: None

        Unable to add grade -1.5 to Flavia Rossi
        Unable to add grade 1.75 to Flavia

        Class: I1
        Mario Rossi
        Grades: 3.5 4.25
        Flavia Bianchi
        Grades: 5.75
        */
    }
}
