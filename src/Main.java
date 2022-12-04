public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String [] [] book = {
                {"’Мертвые", "души’", "Николай", "Васильевич", "Гоголь", "1841"},
        {"’Пиковая", "дама’", "Александр", "Сергеевич", "Пушкин", "1833"}
                 };

        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < book[i].length; j++)
                System.out.print(book[i][j] + " ");
            System.out.println();
        }
    }
}


