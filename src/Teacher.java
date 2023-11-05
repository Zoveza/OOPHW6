public abstract class Teacher {
    //  сделал класс абстрактным
    protected String firstName;
    protected String lastName;
//  сделал поля защищёнными

    protected Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

// Убрал возможность получать и переписывать защищённые поля (класс закрыт для модификаций, открыт для расширений)
// Избавился от неиспользуемых функций