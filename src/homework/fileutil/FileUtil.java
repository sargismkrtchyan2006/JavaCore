package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);
    static String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\fileutil\\test.txt";

    public static void main(String[] args) throws IOException {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    static void fileSearch() {
        System.out.println("input path");
        String path = scanner.nextLine();
        System.out.println("input filename");
        String filename = scanner.nextLine();
        File file = new File(path, filename);
        System.out.println(file.exists());

    }

    static void contentSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("please input keyword for search");
        String keyword = scanner.nextLine();
        findFile(path, keyword);
    }

    private static void findFile(String path, String keyword) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        findFile(file.getAbsolutePath(), keyword);
                    } else {
                        if (file.getName().endsWith(".txt")) {
                            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                                String line = "";
                                while ((line = br.readLine()) != null) {
                                    if (line.contains(keyword)) {
                                        System.out.println(file.getAbsolutePath());
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }


        } else {
            System.out.println("Please input correct directory path");
        }
    }

    static void findLines() {
        System.out.println("Please input file path");
        String filePath = scanner.nextLine();
        System.out.println("please input keyword for search");
        String keyword = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()
                && file.getName().endsWith(".txt")) {

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int lineCount = 1;
                while ((line = br.readLine()) != null) {
                    if (line.contains(keyword)) {
                        line = line.replaceAll(keyword, "\u001B[33m" + keyword + "\u001B[0m");
                        System.out.println(lineCount + "-> " + line);
                    }
                    lineCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    static void printSizeOfPackage() {
        System.out.println("Please input directory path");
        String directoryPath = scanner.nextLine();

        File file = new File(directoryPath);

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            long size = 0;
            for (File file1 : files) {
                if (file1.isFile()) {
                    size += file1.length();
                }
            }
            System.out.println("Size of package: " + (size / (1024 * 1024)) + "mb");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Please input directory path");
        String directoryPath = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input file content");
        String fileContent = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File newFile = new File(directory, fileName);
            if (!newFile.exists()) {
                try {
                    newFile.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                        bw.write(fileContent);
                        System.out.println("File is ready!");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Please input fileName that is not exists");
            }
        } else {
            System.out.println("Please input correct directory");
        }

    }

}

