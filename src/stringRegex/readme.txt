String Regex: starts with: ^ and Ends with: $
\d+ matches one or several digits.
" + maxDigitsPriorToDecimal + " : representing variable<maxDigitsPriorToDecimal>

Ex: 1. "^[+-]?\\d{1," + maxDigitsPriorToDecimal + "}(?:\\.\\d{1," + maxDigitAfterDecimal + "})?$"
    2. "this\s+is\s+text" -> means "this" followed by one or more whitespace characters followed by the word "is" followed by
                                one or more whitespace characters followed by the word "text".
    3. ^\d+(\.\d+)? -> means ^ defines that the patter must start at beginning of a new line. \d+ matches one or several digits.
                                The ? makes the statement in brackets optional. \. matches ".",
                                parentheses are used for grouping. Matches for example "5", "1.5" and "2.21".