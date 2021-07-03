package main.java.hello.codeliner.java8.functional_interface.optional;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import main.java.hello.codeliner.java8.functional_interface.stream.OnlineClass;

/**
 * Optional.of()
 * Optional.ofNullable()
 * Optional.empty()
 * isPresent()
 * isEmpty()
 * get()
 * ifPresent()
 * orElse(T)
 * orElseGet(Supplier)
 * orElseThrow()
 * filter(Predicate)
 * map(Function)
 * flatMap(Function)
 */
public class OptionalExample {
    
    /**
     * not using Optional type.
     */
    public static void getProgress() {
        System.out.println("getProgress");
        OnlineClass oc = new OnlineClass(1, "spring boot", true);
        try {

            Progress progress = oc.getProgress();
            Duration duration = progress.getDuration();
            System.out.println("duration : " + duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ifPresent().
     * Optional type.
     */
    public static void getProgressWithOptional() {
        System.out.println("getProgressWithOptional");
        OnlineClass oc = new OnlineClass(1, "spring boot", true);
        Optional<Progress> progress = oc.getProgressWithOptional();
        progress.ifPresent(System.out::println);
    }

    /**
     * isPresent().
     * isEmpty().
     */
    public static void isPresentAndIsEmpty(List<OnlineClass> springs) {
        System.out.println("isPresentAndIsEmpty");
        Optional<OnlineClass> foundFirst = springs.stream()
            .filter(c -> c.getTitle().startsWith("spring"))
            .findFirst();
        boolean isPresent = foundFirst.isPresent();
        System.out.println("isPresent : " + isPresent);
        boolean isEmpty = foundFirst.isEmpty();
        System.out.println("isEmpty : " + isEmpty);
        OnlineClass onlineClass = foundFirst.get();
        System.out.println(onlineClass);
    }

    /**
     * get().
     * May raise NoSuchElementException.
     */
    public static void getItem(List<OnlineClass> springs) {
        System.out.println("getItem");
        Optional<OnlineClass> found = springs.stream()
            .filter(c -> c.getTitle().contains("spring"))
            .findAny();
        OnlineClass foundItem = found.get();
        System.out.println(foundItem);

        Optional<OnlineClass> notFound = springs.stream()
            .filter(c -> c.getTitle().contains("java"))
            .findAny();

        try {
            OnlineClass notFoundItem = notFound.get();
            System.out.println(notFoundItem);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    /**
     * orElse().
     * not lazy.
     */
    public static void getOrElse(List<OnlineClass> springs) {
        System.out.println("getOrElse");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("spring"))
            .findAny();

        OnlineClass orElse = foundAny.orElse(new OnlineClass());
        System.out.println(orElse);
    }

    /**
     * orElseGet().
     * lazy.
     */
    public static void getOrElseGet(List<OnlineClass> springs) {
        System.out.println("getOrElseGet");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("java"))
            .findAny();
        OnlineClass orElseGet = foundAny.orElseGet(OnlineClass::new);
        System.out.println(orElseGet);
    }

    /**
     * orElseThrow().
     * raise NoSuchElementException.
     */
    public static void getOrElseThrow(List<OnlineClass> springs) {
        System.out.println("getOrElseThrow");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("java"))
            .findAny();
            try {
                OnlineClass orElseThrow = foundAny.orElseThrow();
                System.out.println(orElseThrow);
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            }
    }

    /**
     * filter().
     */
    public static void optionalFilter(List<OnlineClass> springs) {
        System.out.println("filter");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("spring"))
            .findAny();
        
        Optional<OnlineClass> filtered = foundAny.filter(OnlineClass::isClosed);
        filtered.ifPresent(System.out::println);
    }

    /**
     * map().
     */
    public static void optionalMap(List<OnlineClass> springs) {
        System.out.println("optionalMap");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("spring"))
            .findAny();

        Optional<Integer> mapped = foundAny.map(c -> c.getId());
        mapped.ifPresent(System.out::println);
    }

    /**
     * flatMap() not applied.
     */
    public static void getOptionalTypeItem(List<OnlineClass> springs) {
        System.out.println("getOptionalTypeItem");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("spring"))
            .findAny();
        Optional<Optional<Progress>> optionalTypeItem = foundAny.map(c -> c.getProgressWithOptional());
        try {
            Optional<Progress> progress = optionalTypeItem.orElseThrow();
            Progress realProgress = progress.orElseThrow();
            System.out.println(realProgress);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    /**
     * flatMap() applied.
     */
    public static void optionalFlatMap(List<OnlineClass> springs) {
        System.out.println("optionalFlatMap");
        Optional<OnlineClass> foundAny = springs.stream()
            .filter(c -> c.getTitle().contains("spring"))
            .findAny();
        Optional<Progress> progress = foundAny.flatMap(OnlineClass::getProgressWithOptional);
        progress.ifPresent(System.out::println);
    }
}
