import javax.swing.JOptionPane;

public class TryZodiac {

    public static methods() {
        boolean tryAgain = true;

        while (tryAgain) {
            int month = 0, day = 0, year = 0;
            // Prompt user to enter birth date
            try {
                month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Birth month: (1-12)",
                        "Enter your Month ", JOptionPane.PLAIN_MESSAGE));
                if (month > 12 || month < 1) { // Catch error if number is below 1 and above 12
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1-12.");
                    continue;
                }
                day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the  of your Birthday: (1-31)",
                        "Enter your Day ", JOptionPane.PLAIN_MESSAGE));
                if (day > 31 || day < 1) { // Catch error if number is below 1 and above 31
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1-31.");
                    continue;
                }
                year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Birth year: (1770's to 2023)",
                        "Enter your month ", JOptionPane.PLAIN_MESSAGE));
                if (year > 1923 || year < 2023) {
                    JOptionPane.showMessageDialog(null, "Invalid input. please Enter (1923's to 2032 only )",
                            "Error Message", JOptionPane.PLAIN_MESSAGE);
                    return;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You are pressing Wrong Button.");
                return;

            }

            JOptionPane.showMessageDialog(null, "Your Birth Date is: " + month + "/" + day + "/" + year);

            // Determine Zodiac sign day of birth
            String zodiacSign = "";
            if ((month == 3 && day == 21) || (month == 4 && day >= 20)) {
                zodiacSign = "Aries";
            } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
                zodiacSign = "Taurus";
            } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
                zodiacSign = "Gemini";
            } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
                zodiacSign = "Cancer";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                zodiacSign = "Leo";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                zodiacSign = "Virgo";
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                zodiacSign = "Libra";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                zodiacSign = "Scorpio";
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                zodiacSign = "Sagittarius";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
                zodiacSign = "Capricorn";
            } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
                zodiacSign = "Aquarius";
            } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
                zodiacSign = "Pisces";
            }

            // Determine animal birth year
            String animal = "";
            if (year == 1924 || year == 1936 || year == 1948 || year == 1960 || year == 1972 || year == 1984
                    || year == 1996 || year == 2008 || year == 2020) {
                animal = "Rat";

            }
            if (year == 1925 || year == 1937 || year == 1949 || year == 1961 || year == 1973 || year == 1985
                    || year == 1997 || year == 2009 || year == 2021) {
                animal = "Ox";

            }
            if (year == 1926 || year == 1938 || year == 1950 || year == 1962 || year == 1974 || year == 1986
                    || year == 1998 || year == 2010 || year == 2022) {
                animal = "Tiger";

            }
            if (year == 1927 || year == 1939 || year == 1951 || year == 1963 || year == 1975 || year == 1987
                    || year == 1999 || year == 2011 || year == 2023) {
                animal = "Rabbit";

            }
            if (year == 1928 || year == 1940 || year == 1952 || year == 1964 || year == 1976 || year == 1988
                    || year == 2000 || year == 2012 || year == 2024) {
                animal = "Dragon";

            }
            if (year == 1929 || year == 1941 || year == 1953 || year == 1965 || year == 1977 || year == 1989
                    || year == 2001 || year == 2013 || year == 2025) {
                animal = "Snake";

            }
            if (year == 1930 || year == 1942 || year == 1954 || year == 1966 || year == 1978 || year == 1990
                    || year == 2002 || year == 2014 || year == 2026) {
                animal = "Horse";

            }
            if (year == 1931 || year == 1943 || year == 1955 || year == 1967 || year == 1979 || year == 1991
                    || year == 2003 || year == 2015 || year == 2027) {
                animal = "Sheep";

            }
            if (year == 1932 || year == 1945 || year == 1956 || year == 1968 || year == 1980 || year == 1992
                    || year == 2004 || year == 2016 || year == 2028) {
                animal = "Monkey";

            }
            if (year == 1933 || year == 1946 || year == 1957 || year == 1969 || year == 1981 || year == 1993
                    || year == 2005 || year == 2017 || year == 2029) {
                animal = "Rooster";

            }
            if (year == 1934 || year == 1947 || year == 1958 || year == 1970 || year == 1982 || year == 1994
                    || year == 2006 || year == 2018 || year == 2030) {
                animal = "Dog";

            }
            if (year == 1935 || year == 1948 || year == 1959 || year == 1971 || year == 1983 || year == 1995
                    || year == 2007 || year == 2019 || year == 2031) {
                animal = "Pig";
            }

            // Determine birth stone based on month
            String birthstone = "";
            if (month == 1) {
                birthstone = "Garnet for passion and happiness.";
            }
            if (month == 2) {
                birthstone = "Amethyst for relaxation and intuition.";
            }
            if (month == 3) {
                birthstone = "Aquamarine for protection and communication, Bloodstone for energy and confidence.";
            }
            if (month == 4) {
                birthstone = " Diamond for love and longevity.";
            }
            if (month == 5) {
                birthstone = "Emerald for love and kindness.";
            }
            if (month == 6) {
                birthstone = "Pearl, Moonstone and Alexandrite.";
            }
            if (month == 7) {
                birthstone = " Ruby for protection and vitality.";
            }
            if (month == 8) {
                birthstone = "Peridot, Spinel and Sardonyx restoration, Sardonyx for courage and communication.";
            }
            if (month == 9) {
                birthstone = "Sapphire for self-expression and sincerity";
            }
            if (month == 10) {
                birthstone = "Opal for truth and protection, Tourmaline for protection and creativity.";
            }
            if (month == 11) {
                birthstone = "Topaz for strength and intelligence, Citrine for abundance and happiness.";
            }
            if (month == 12) {
                birthstone = "Turquoise for wellbeing and good fortune, Tanzanite for intuition and spiritual awakening, Zircon for protection and wisdom.";
            }
            // Show birth year using JOption
            JOptionPane.showMessageDialog(null, "\n Birthstone is: " + birthstone + "\n Zodiac Sign:" + zodiacSign
                    + "\n Astrological Sign : " + animal, "Zodiac Sign", JOptionPane.PLAIN_MESSAGE);
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "Try again?",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                tryAgain = true;
            } else {
                tryAgain = false;

                JOptionPane.showMessageDialog(null, "Thank you for using the program!", "Thankyou Message!",
                        JOptionPane.PLAIN_MESSAGE);
            }

        }
    }
}
