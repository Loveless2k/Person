public class Person {
    private String firstName, lastName;
    private int age;

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        // Verifica si ambos, firstName y lastName, están vacíos o nulos.
        // La verificación de nulos es crucial para prevenir NullPointerException.
        boolean isFirstNameEmpty = firstName == null || firstName.trim().isEmpty();
        boolean isLastNameEmpty = lastName == null || lastName.trim().isEmpty();

        // Si ambos están vacíos, retorna una cadena vacía.
        if (isFirstNameEmpty && isLastNameEmpty) {
            return "";
        }

        // Utiliza trim() para eliminar espacios innecesarios antes o después de los nombres.
        String trimmedFirstName = isFirstNameEmpty ? "" : firstName.trim();
        String trimmedLastName = isLastNameEmpty ? "" : lastName.trim();

        // Retorna el nombre completo, evitando un espacio adicional si uno de los nombres está vacío.
        return (trimmedFirstName + " " + trimmedLastName).trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            this.age = 0;
            return;
        }
        this.age = age;
    }
}
