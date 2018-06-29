String Regex: Finds regex that must match at the beginning of the line.: ^ and Ends with: $
\d+ matches one or several digits.
" + maxDigitsPriorToDecimal + " : representing variable<maxDigitsPriorToDecimal>

Ex: 1. "^[+-]?\\d{1," + maxDigitsPriorToDecimal + "}(?:\\.\\d{1," + maxDigitAfterDecimal + "})?$"
    2. "this\s+is\s+text" -> means "this" followed by one or more whitespace characters followed by the word "is" followed by
                                one or more whitespace characters followed by the word "text".
    3. ^\d+(\.\d+)? -> means ^ defines that the patter must start at beginning of a new line. \d+ matches one or several digits.
                                The ? makes the statement in brackets optional. \. matches ".",
                                parentheses are used for grouping. Matches for example "5", "1.5" and "2.21".

    [abc] :   Set definition, can match the letter a or b or c.

    [abc][vz] :  Set definition, can match a or b or c followed by either v or z.

    [^abc] :  When a caret appears as the first character inside square brackets, it negates the pattern.
               This pattern matches any character except a or b or c.

    [a-d1-7] : Ranges: matches a letter between a and d and figures from 1 to 7, but not d1.

    .	Any character (may or may not match terminator)
    \d: Any digit, short for [0-9]
    \D : A non-digit, short for [^0-9]
    \s : A whitespace character, short for [ \t\n\x0b\r\f]
    \S : A non-whitespace character, short for
    \w : A word character, short for [a-zA-Z_0-9]
    \W : A non-word character [^\w]
    \S+: Several non-whitespace characters
    \b : Matches a word boundary where a word character is [a-zA-Z0-9_]

    X?	X occurs once or not at all
    X+	X occurs once or more times
    X*	X occurs zero or more times
    X{n}	X occurs n times only
    X{n,}	X occurs n or more times
    X{y,z}	X occurs at least y times but less than z times

    s.matches("regex") : Evaluates if "regex" matches s. Returns only true if the WHOLE string can be matched.
    s.split("regex")   : Creates an array with substrings of s divided at occurrence of "regex". "regex" is not included in the result.
    s.replaceFirst("regex"), "replacement" : Replaces first occurance of "regex" with "replacement.
    s.replaceAll("regex"), "replacement" : Replaces all occurances of "regex" with "replacement.

    "^0+(?!$)" : "(?!a)" is just a node which is quantifiable.
     You can check if the next character is an 'a' 10 times.
      It will return the same result each time though, so it's not very useful.

     (?=pattern), (?:pattern) and (?!pattern) :
