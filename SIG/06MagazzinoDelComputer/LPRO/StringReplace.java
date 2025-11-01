
public class StringReplace {

    public static void main(String[] args) {

        /*
        String.replace()
        Purpose: Replaces all occurrences of a specified target character or literal string with a replacement.
        Usage:
        It does not use regular expressions. Instead, it works with exact matches.
        It's straightforward for simple replacements of characters or substrings.
        */

        String str = "apple banana apple";
        System.out.println(str);

        // Replace all 'a' characters with 'o'
        String result1 = str.replace('a', 'o'); // "opple bonono opple"
        System.out.println(result1);

        // Replace all "apple" substrings with "orange"
        String result2 = str.replace("apple", "orange"); // "orange banana orange"
        System.out.println(result2);

        /*
        apple banana apple
        opple bonono opple
        orange banana orange
        */
        
        //--

        /*
        String.replaceAll()
        Purpose: Replaces all substrings that match a given regular expression with a replacement.
        Usage:
        It uses regular expressions for pattern matching.
        This is more powerful and flexible, allowing complex matching and replacement.
        */

        String str2 = "apple banana apple123";
        // Replace all words "apple" followed by digits
        System.out.println(str2);

        String result11 = str2.replaceAll("apple\\d+", "orange"); // "apple banana orange"
        System.out.println(result11);

        // Replace all whitespace with a hyphen
        String result22 = str2.replaceAll("\\s", "-"); // "apple-banana-apple123"
        System.out.println(result22);

        /*
        apple banana apple123
        apple banana orange
        apple-banana-apple
        */

        /*
        Key Differences:
        Feature	replace()	                    replaceAll()
        Matches	Exact characters or strings	    Regular expressions
        Use Cases	                            Simple replacements	Pattern-based replacements
        Flexibility	                            Limited	Highly flexible due to regex support
        Performance	Faster, simpler processing	Slower, more processing for regex
        */

    }

}
