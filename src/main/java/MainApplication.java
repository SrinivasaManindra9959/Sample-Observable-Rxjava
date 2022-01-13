
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;


public class MainApplication {
    public static void main(String[] args){
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        final StringBuilder result1 = new StringBuilder();
        PublishSubject<String> sub = PublishSubject.create();
        sub.subscribe(r->result.append(r));
        sub.onNext("k");
        sub.onNext("B");
        sub.subscribe(r->result.append(r));
        sub.subscribe(r->result1.append(r));
        System.out.println(result);
        System.out.println(result1);

    }
}
