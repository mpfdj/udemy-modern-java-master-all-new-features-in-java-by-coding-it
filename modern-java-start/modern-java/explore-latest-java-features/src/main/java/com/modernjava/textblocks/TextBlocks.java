package com.modernjava.textblocks;

public class TextBlocks {


    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return multiLine;
    }

    public static String multiLineStringV2() {

        return """
                This is a
                    "multiline" string
                with newlines inside
                """;
    }


    public static String multiLineString(String firstName, String lastName) {

        return """
                Hello %s %s,
                This is a
                    multiline string
                with newlines inside
                """.formatted(firstName, lastName);
    }


    public static String multiLinetStringJson() {

        var json = """
                {
                  "name": "Radiohead",
                  "albums": [
                    {
                      "title": "The King of Limbs",
                      "songs": [
                        {
                          "title": "Bloom",
                          "length": "5:15"
                        },
                        {
                          "title": "Morning Mr Magpie",
                          "length": "4:41"
                        },
                        {
                          "title": "Little by Little",
                          "length": "4:27"
                        },
                        {
                          "title": "Feral",
                          "length": "3:13"
                        },
                        {
                          "title": "Lotus Flower",
                          "length": "5:01"
                        },
                        {
                          "title": "Codex",
                          "length": "4:47"
                        },
                        {
                          "title": "Give Up the Ghost",
                          "length": "4:50"
                        },
                        {
                          "title": "Separator",
                          "length": "5:20"
                        }
                      ],
                      "description": "The King of Limbs is the eighth studio album by English rock band Radiohead, produced by Nigel Godrich. It was self-released on 18 February 2011 as a download in MP3 and WAV formats, followed by physical CD and 12\\" vinyl releases on 28 March, a wider digital release via AWAL, and a special \\"newspaper\\" edition on 9 May 2011. The physical editions were released through the band's Ticker Tape imprint on XL in the United Kingdom, TBD in the United States, and Hostess Entertainment in Japan."
                    }
                  ]
                }
                """;

        return json;
    }


    public static String multiLinetStringSql() {
        var sql = """
                SELECT CustomerName, City
                FROM Customers;
                """;

        return sql;
    }


    public static String singleAndDoubleQuotes() {
        return """
               Know your Java's! with "doublequotes"
               """;
    }


    public static void main(String[] args) {
        System.out.println("multiLineString = " + multiLineString());
        System.out.println("multiLineStringV2 = " + multiLineStringV2());
        System.out.println("multiLineString = " + multiLineString("Miel", "de Jaeger"));
        System.out.println("multiLinetStringJson = " + multiLinetStringJson());
        System.out.println("multiLinetStringSql = " + multiLinetStringSql());
        System.out.println("singleAndDoubleQuotes = " + singleAndDoubleQuotes());
    }
}
