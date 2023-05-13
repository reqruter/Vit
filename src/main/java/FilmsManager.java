public class FilmsManager {
    private String[] films = new String[0];

    public void addFilm(String Film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }
        tmp[tmp.length - 1] = Film;
        films = tmp;
    }

    public String[] FindAll() {
        return films;

    }

    public String[] FindLast() {
        int resultLength;
        if (films.length < 5) {
            resultLength = films.length;
        } else {
            resultLength = 5;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
    }
}