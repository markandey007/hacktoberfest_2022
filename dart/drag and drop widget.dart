import 'package:dragdrop/reorderlist.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  Color color =Colors.black;

  @override
  Widget build(BuildContext context) {
    final showDraggable=color==Colors.black;

    return Scaffold(

      body: Center(

        child: Column(mainAxisAlignment: MainAxisAlignment.center,
          children: [
DragTarget<Color>(onAccept:(data)=>setState(()=>color=data),
    builder: (context,_,__)=>Container(color: color,height: 200,width: 200,)),
          SizedBox(height: 100,),
          IgnorePointer(
            ignoring: !showDraggable,
            child: Opacity(opacity: showDraggable?1:0,child:Draggable<Color>(data: Colors.green,
              child: Container(color: Colors.green,height: 200,width: 200,),
              feedback: Container(color: Colors.green,height: 200,width: 200,),
              childWhenDragging: Container(color: Colors.transparent,height: 200,width: 200,),) ,),
          ),
            ElevatedButton(onPressed: (){
              Navigator.pushReplacement(context, MaterialPageRoute(builder: (context)=>reorderlist()));
            }, child:Text("press"))

        ],)

      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
