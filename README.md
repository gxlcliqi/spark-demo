# Project Title

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Jdk8 is required to run the test, Jdk12 doesn't work

Exception in thread "main" java.lang.ExceptionInInitializerError
    at org.apache.hadoop.util.StringUtils.<clinit>(StringUtils.java:80)
    at org.apache.hadoop.fs.FileSystem$Cache$Key.<init>(FileSystem.java:2807)
    at org.apache.hadoop.fs.FileSystem$Cache$Key.<init>(FileSystem.java:2802)
    at org.apache.hadoop.fs.FileSystem$Cache.get(FileSystem.java:2668)
    at org.apache.hadoop.fs.FileSystem.get(FileSystem.java:371)
    at com.wxe.app.WordCount.main(WordCount.java:62)
Caused by: java.lang.StringIndexOutOfBoundsException: begin 0, end 3, length 2
    at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3107)
    at java.base/java.lang.String.substring(String.java:1873)
    at org.apache.hadoop.util.Shell.<clinit>(Shell.java:51)
    ... 6 more

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

