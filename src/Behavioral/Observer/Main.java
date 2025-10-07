package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannelObservable codeEasy = new YoutubeChannelObservable("Code Easy");
        YoutubeChannelObservable systemDesign = new YoutubeChannelObservable("System Design");

        Subscriber suraj = new Subscriber("Suraj Pal");
        Subscriber amit = new Subscriber("Amit Kar");
        Subscriber dipu = new Subscriber("Dipu K");
        Subscriber subham = new Subscriber("Subham M");

        codeEasy.subscribe(subham);
        codeEasy.subscribe(suraj);
        systemDesign.subscribe(amit);
        systemDesign.subscribe(dipu);

        codeEasy.uploadVideo("Merge sort algo full details");
        codeEasy.uploadVideo("Dsa basics");
        codeEasy.unSubscribe(subham);
        systemDesign.uploadVideo("Observer design pattern in details");
    }
}
