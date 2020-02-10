package com.java.project.draw;

public class MyPrinter {

    public static String print(int n, MMlogo logo) {
        int rowNum = 0;

        //Creates top part of the logo
        for (rowNum = 0; 2 * rowNum <= n - 1; rowNum++) {
            logo.setStarsNum(n, rowNum);
            logo.setStartDashesNum(n, rowNum);
            logo.setMiddleDashesNum(n, rowNum);

            StringBuilder builder = new StringBuilder();

            for (int star = 1; star <= logo.getStarsNum(); star++) {
                builder.append("*");
            }

            String starsBlock = builder.toString();
            builder.setLength(0);

            for (int dash = 1; dash <= logo.getStartDashesNum(); dash++) {
                builder.append("-");
            }

            String dashesAtStart = builder.toString();
            builder.setLength(logo.getMiddleDashesNum());

            String middleDashes = builder.toString();
            builder.setLength(0);
            builder.append(dashesAtStart);
            builder.append(starsBlock);
            builder.append(middleDashes);
            builder.append(starsBlock);
            builder.append(dashesAtStart);

            String halfRow = builder.toString();
            builder.append(halfRow);
            logo.addLine(builder.toString());
            builder.setLength(0);
        }



        // Creates bottom part of the logo

        StringBuilder builder = new StringBuilder();

        for (int star = 1; star <= n; star++) {
            builder.append("*");
        }
        String starsNum = builder.toString();
        builder.setLength(0);


        int middleDashes = 1;

        for (int row = rowNum; row <= n; row++) {

            for (int star = 1; star <= 2 * n - middleDashes; star++) {
                builder.append("*");
            }

            String middleStars = builder.toString();

            builder.setLength(0);

            for (int dash = 1; dash <= n - row; dash++) {
                builder.append("-");
            }

            String dashesAtStartAndEnd = builder.toString();
            builder.setLength(0);

            for (int dash = 1; dash <= middleDashes; dash++) {
                builder.append("-");
            }

            String interDashes = builder.toString();
            builder.setLength(0);

            builder.append(dashesAtStartAndEnd);
            builder.append(starsNum);
            builder.append(interDashes);
            builder.append(middleStars);
            builder.append(interDashes);
            builder.append(starsNum);
            builder.append(dashesAtStartAndEnd);

            String halfRow = builder.toString();
            builder.append(halfRow);


            logo.addLine(builder.toString());
            builder.setLength(0);

            middleDashes += 2;

        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < logo.getLines().size(); i++) {
            result.append(logo.getLines().get(i) + "\n");
        }

        return result.toString();
    }
}

