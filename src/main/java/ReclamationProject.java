/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**.
 *
 * Class thats a reclamation project.
 *
 */

public class ReclamationProject {
    /**
     *
     * @param a string a
     * @param b string b
     * @return r
     */

    static String doIt(final String a, final String b) {
        String c = "", d = "";
        if (a.length() > b.length()) {
            c = a;
            d = b;
            // a = b;
            // b = c;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < d.length(); i++) {
            for (int j = d.length() - i; j > 0; j--) {
                for (int k = 0; k < c.length() - j; k++) {
                    if (d.regionMatches(i, c, k, j) && j > r.length()) {
                        r = d.substring(i, i + j);
                    } else {
                        continue;
                    }
                }
            }
        }
        return r;
    }
}
