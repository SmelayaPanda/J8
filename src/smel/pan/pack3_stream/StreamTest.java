package smel.pan.pack3_stream;/** * Created by SmelayaPanda on 21.04.2016. * * @Stream A java.util.Stream represents a sequence of elements on which one or more operations can be performed. * Stream operations are either intermediate or terminal. * While terminal operations return a result of a certain type, * intermediate operations return the stream itself so you can chain multiple method calls in a row. * Streams are created on a source, e.g. a java.util.Collection like lists or sets (maps are not supported). * Stream operations can either be executed sequential or parallel. */public class StreamTest {    public static void main(String[] args) {/** * You can simply create streams either by calling: * Collection.stream() * or Collection.parallelStream() * */    }}