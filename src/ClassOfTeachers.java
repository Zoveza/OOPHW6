import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassOfTeachers<T extends Teacher>  {
    private String nameGroup;
    private List<T> numberOfTeachers;
    private int index;

    public ClassOfTeachers(String nameGroup) {
        this.numberOfTeachers = new ArrayList<>();
        this.nameGroup = nameGroup;
    }

    public String getName() {
        return nameGroup;
    }

    public void add(T teacher){
        numberOfTeachers.add(teacher);
    }

    public int count() {
        return numberOfTeachers.size();
    }

    public T get(Integer index) {
        return numberOfTeachers.get(index);
    }
}

//  Итератор перенесён в отдельный класс, в классе оставлена только логика отвечающая за формирование группы учителей
//  Класс параметаризован
