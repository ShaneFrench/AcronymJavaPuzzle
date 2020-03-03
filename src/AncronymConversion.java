public class AncronymConversion {

    public static void main(String[] args) {
        String[] arr = {"Portable Network Graphics",
                "Ruby on Rails",
                "HyperText Markup Language",
                "First In, First Out",
                "PHP: Hypertext Preprocessor",
                "GNU Image Manipulation Program",
                "Complementary metal-oxide semiconductor",
                " Cat in a Hat"};

        for (String words : arr)
        {
            String[] splits = words.split("[a-z]+");
            String acronym = "";

            for (String split : splits)
                acronym = acronym + split;

            acronym = acronym.replaceAll("\\s", "");
        }


    }
}
