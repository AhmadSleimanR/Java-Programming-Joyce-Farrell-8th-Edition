package recordingsort;

import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Recording[] recordingsArray = new Recording[5];
        int a, b;
        Recording temp;
        final int MAXSIZE = recordingsArray.length - 1;
        int iterations = MAXSIZE;
        Scanner input = new Scanner(System.in);
        String entered;
        for(a = 0;a < recordingsArray.length;++a){
            if(recordingsArray[a] == null){
                recordingsArray[a] = new Recording();
                System.out.println("Please enter the title:");
                recordingsArray[a].setrTitle(input.nextLine());
                System.out.println("Now, please enter the artist:");
                recordingsArray[a].setrArtist(input.nextLine());
                System.out.println("Now, please enter the play time in seconds");
                recordingsArray[a].setrPlayTime(input.nextInt());
                input.nextLine();
            }
        }
        display(recordingsArray, 0);
        System.out.println("Please enter which category you want to sort the array by:");
        entered = input.nextLine();
        switch(entered.toUpperCase()){
            case "TITLE":
                for(a = 0;a < MAXSIZE;++a){
                    for(b = 0;b < iterations;++b){
                        if(recordingsArray[b].getrTitle().compareTo(recordingsArray[b+1].getrTitle()) > 0){
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b+1];
                            recordingsArray[b+1] = temp;
                        }
                    }
                    display(recordingsArray, (a+1));
                    --iterations;
                }
                break;
            case "ARTIST":
                for(a = 0;a < MAXSIZE;++a){
                    for(b = 0;b < iterations;++b){
                        if(recordingsArray[b].getrArtist().compareTo(recordingsArray[b+1].getrArtist()) > 0){
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b+1];
                            recordingsArray[b+1] = temp;
                        }
                    }
                    display(recordingsArray, (a+1));
                    --iterations;
                }
                break;
            case "PLAYTIME":
                for(a = 0;a < MAXSIZE;++a){
                    for(b = 0;b < iterations;++b){
                        if(recordingsArray[b].getrPlayTime() > recordingsArray[b+1].getrPlayTime()){
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b+1];
                            recordingsArray[b+1] = temp;
                        }
                    }
                    display(recordingsArray, (a+1));
                    --iterations;
                }
                break;
        }
    }
    public static void display(Recording[] recordingsArray, int iterations){
        System.out.println("Iteration #"+iterations);
        for(int x = 0;x < recordingsArray.length;++x)
            System.out.println("Title: "+recordingsArray[x].getrTitle()+" "+
                    "Artist: "+recordingsArray[x].getrArtist()+" "+
                    "Playtime: "+recordingsArray[x].getrPlayTime());
        System.out.println();
    }
}
