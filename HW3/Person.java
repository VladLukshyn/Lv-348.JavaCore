����   6 h  Person  java/lang/Object name1 Ljava/lang/String; birthday I year input (Ljava/io/BufferedReader;)V 
Exceptions  java/io/IOException Code	    java/lang/System   out Ljava/io/PrintStream;  name?
    java/io/PrintStream   println (Ljava/lang/String;)V
  !   java/io/BufferedReader " # readLine ()Ljava/lang/String;	  %   ' 	birthday?
 ) + * java/lang/Integer , - parseInt (Ljava/lang/String;)I	  /   LineNumberTable LocalVariableTable this LPerson; br Ljava/io/BufferedReader; <init> ()V
  9 6 7	  ; 	  (Ljava/lang/String;I)V getName1 setName1 getBirthday ()I setBirthday (I)V getYear setYear 
changeName
 G I H java/time/LocalDate J K now ()Ljava/time/LocalDate;
 G M C @ toString P java/lang/StringBuilder R Person (name1=
 O T 6 
 O V W X append -(Ljava/lang/String;)Ljava/lang/StringBuilder; Z , birthday=
 O \ W ] (I)Ljava/lang/StringBuilder; _ , year=
  a 	 @ c )
 O e N # 
SourceFile Person.java !                 	      
            h     $� � *+� � $� &� *+� � (� .�    0              #  1       $ 2 3     $ 4 5   6 7     E     *� 8*� .*� :�    0          	 	   1        2 3    6 <     k     *� 8*� .*� :*+� $*� .�    0          	 	       1         2 3                = #     /     *� $�    0        1        2 3    >      >     *+� $�    0   
       ! 1        2 3          ? @     /     *� .�    0       $ 1        2 3    A B     >     *� .�    0   
    (  ) 1        2 3          C @     /     *� :�    0       / 1        2 3    D B     >     *� :�    0   
    3  4 1        2 3      	    E      >     *+� $�    0   
    7  8 1        2 3          	 @     6     � F� L*� .d�    0       ; 1        2 3    N #     [     1� OYQ� S*� $� UY� U*� .� [^� U*� `� [b� U� d�    0       F 1       1 2 3    f    g