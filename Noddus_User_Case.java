//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

/* Protobuff format for "name" and "id" records
*/
message Person {
  required string name = 1;
  required int32 id = 2;
}

/* An http server that recieves a JSON object as body in the protobuff format shown above. 
*/
protected Boolean doInBackground(String ID) {
HttpClient httpClient = new DefaultHttpClient();
Date dateTime = new Date();
string deviceID=null;
try {
HttpPost request = new HttpPost("http://192.168.1.89:80/");
JSONObject json = new JSONObject();
json.put("IDNo", ID.toString());
json.put("DTSent", dateTime);
json.put("DeviceID", deviceID);

StringEntity se = new StringEntity(json.toString(), "UTF-8");
se.setContentType("application/json; charset=UTF-8");
request.setEntity(se);
request.setHeader( "Content-Type", "application/json");
}


/* Saves the data to disk using a google protobuff and rollover after timeout- threadsafe, close file, open new file, the file stays open till rollover
*/

/* Integrated with docker compose, saving the following code in a new project called docker-compose.yml 
web:
  build: .
  ports:
   - "8000:8000"
  links:
   - redis
redis:
  image: redis

{Dockerfile- Creating Dockerfile that has to be in the same directory as docker-compose.yml}

FROM ubuntu:14.04
MAINTAINER javacodegeeks
 
RUN apt-get update && apt-get install -y python-software-properties software-properties-common
RUN add-apt-repository ppa:webupd8team/java
 
RUN echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 boolean true" | debconf-set-selections
 
RUN apt-get update && apt-get install -y oracle-java8-installer maven
 
ADD . /usr/local/todolist
RUN cd /usr/local/todolist && mvn assembly:assembly
CMD ["java", "-cp", "/usr/local/todolist/target/todolist-1.0-jar-with-dependencies.jar", "com.javacodegeeks.todolist.TodoServer"]
*/
/* Launced from the command line using a bash script. You would run the following script from the command line. 
// Output file stream
   FileOutputStream dest = new FileOutputStream( "c:/test/test.tar" );

   // Create a TarOutputStream
   TarOutputStream out = new TarOutputStream( new BufferedOutputStream( dest ) );

   // Files to tar
   File[] filesToTar=new File[2];
   filesToTar[0]=new File("c:/test/myfile1.txt");
   filesToTar[1]=new File("c:/test/myfile2.txt");

   for(File f:filesToTar){
      out.putNextEntry(new TarEntry(f, f.getName()));
      BufferedInputStream origin = new BufferedInputStream(new FileInputStream( f ));

      int count;
      byte data[] = new byte[2048];
      while((count = origin.read(data)) != -1) {
         out.write(data, 0, count);
      }

      out.flush();
      origin.close();
   }

   out.close();
*/

/* Would launch this file from the command line using the following bash script(//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111


/* Saves the data to disk using a google protobuff and rollover after timeout- threadsafe, close file, open new file, the file stays open till rollover
*/

/* Integrated with docker compose, saving the following code in a new project called docker-compose.yml 
web:
  build: .
  ports:
   - "8000:8000"
  links:
   - redis
redis:
  image: redis

{Dockerfile- Creating Dockerfile that has to be in the same directory as docker-compose.yml}

FROM ubuntu:14.04
MAINTAINER javacodegeeks
 
RUN apt-get update && apt-get install -y python-software-properties software-properties-common
RUN add-apt-repository ppa:webupd8team/java
 
RUN echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 boolean true" | debconf-set-selections
 
RUN apt-get update && apt-get install -y oracle-java8-installer maven
 
ADD . /usr/local/todolist
RUN cd /usr/local/todolist && mvn assembly:assembly
CMD ["java", "-cp", "/usr/local/todolist/target/todolist-1.0-jar-with-dependencies.jar", "com.javacodegeeks.todolist.TodoServer"]
*/
/* Launced from the command line using a bash script. You would run the following script from the command line. 
// Output file stream
   FileOutputStream dest = new FileOutputStream( "c:/test/test.tar" );

   // Create a TarOutputStream
   TarOutputStream out = new TarOutputStream( new BufferedOutputStream( dest ) );

   // Files to tar
   File[] filesToTar=new File[2];
   filesToTar[0]=new File("c:/test/myfile1.txt");
   filesToTar[1]=new File("c:/test/myfile2.txt");

   for(File f:filesToTar){
      out.putNextEntry(new TarEntry(f, f.getName()));
      BufferedInputStream origin = new BufferedInputStream(new FileInputStream( f ));

      int count;
      byte data[] = new byte[2048];
      while((count = origin.read(data)) != -1) {
         out.write(data, 0, count);
      }

      out.flush();
      origin.close();
   }

   out.close();
*/

/* Would launch this file from the command line using the following bash script:
$prompt: /path/to/script
*/


/* Producing another tar.gz file. 
*/
// Output file stream
   FileOutputStream dest = new FileOutputStream( "c:/test/test.tar" );

   // Create a TarOutputStream
   TarOutputStream out = new TarOutputStream( new BufferedOutputStream( dest ) );

   // Files to tar
   File[] filesToTar=new File[2];
   filesToTar[0]=new File("c:/test/myfile1.txt");
   filesToTar[1]=new File("c:/test/myfile2.txt");

   for(File f:filesToTar){
      out.putNextEntry(new TarEntry(f, f.getName()));
      BufferedInputStream origin = new BufferedInputStream(new FileInputStream( f ));

      int count;
      byte data[] = new byte[2048];
      while((count = origin.read(data)) != -1) {
         out.write(data, 0, count);
      }

      out.flush();
      origin.close();
   }

   out.close();
