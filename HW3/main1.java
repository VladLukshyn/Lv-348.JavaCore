����   6 @  main1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lmain1; main ([Ljava/lang/String;)V 
Exceptions  java/io/IOException  java/io/BufferedReader  java/io/InputStreamReader	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
  !  " (Ljava/io/Reader;)V $ Person
 # 	
 # ' ( ) input (Ljava/io/BufferedReader;)V	  + , - out Ljava/io/PrintStream;
 / 1 0 java/io/PrintStream 2 3 println (Ljava/lang/Object;)V args [Ljava/lang/String; br Ljava/io/BufferedReader; pm1 LPerson; pm2 pm3 pm4 pm5 
SourceFile 
main1.java !               /     *� �    
                    	            &     �� Y� Y� � �  L� #Y� %M,+� &� #Y� %N-+� &� #Y� %:+� &� #Y� %:+� &� #Y� %:+� &� *,� .� *-� .� *� .� *� .� *� .�    
   F    	       '  ,  5  ;  D  J  S  Y  `  g  o  w   !    H    � 4 5    n 6 7   f 8 9  ' Y : 9  5 K ; 9  D < < 9  S - = 9   >    ?