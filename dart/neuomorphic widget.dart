import 'package:flutter/material.dart' hide BoxDecoration, BoxShadow;
import 'package:flutter/widgets.dart';
import 'package:flutter_inset_box_shadow/flutter_inset_box_shadow.dart';
void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

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
      home: const NeumorphismPage(),
    );
  }
}
class NeumorphismPage extends StatefulWidget {
  const NeumorphismPage({Key? key}) : super(key: key);

  @override
  State<NeumorphismPage> createState() => _NeumorphismPageState();
}

class _NeumorphismPageState extends State<NeumorphismPage> {
  bool _isElevated = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey[300],
      body: Center(
        child: GestureDetector(
          onTap: () {
            setState(() {
              _isElevated = !_isElevated;
            });
          },
          child: AnimatedContainer(
            child: Icon(
              Icons.power_settings_new,
              size: 80,
              // Changing icon color on
              // the basis of it's elevation
              color:
              _isElevated ? Colors.grey : Color.fromARGB(255, 83, 220, 230),
            ),
            // Providing duration parameter
            // to create animation
            duration: const Duration(
              milliseconds: 200,
            ),
            height: 200,
            width: 200,
            decoration: BoxDecoration(
              color: Colors.grey[300],
              shape: BoxShape.circle,
              // when _isElevated is false, value
              // of inset parameter will be true
              // that will create depth effect.
              boxShadow: _isElevated
                  ?
              // Elevated Effect
              [

                const BoxShadow(
                  color: Color(0xFFBEBEBE),
                  // Shadow for bottom right corner
                  offset: Offset(10, 10),
                  blurRadius: 30,
                  spreadRadius: 1,
                  inset: false,
                ),
                const BoxShadow(
                  color: Colors.white,
                  // Shadow for top left corner
                  offset: Offset(-10, -10),
                  blurRadius: 30,
                  spreadRadius: 1,
                  inset: false,
                ),
              ]
                  :
              // Depth Effect
              [

                const BoxShadow(
                  color: Color(0xFFBEBEBE),
                  // Shadow for bottom right corner
                  offset: Offset(10, 10),
                  blurRadius: 30,
                  spreadRadius: 1,
                  inset: true,
                ),
                const BoxShadow(
                  color: Colors.white,
                  // Shadow for top left corner
                  offset: Offset(-10, -10),
                  blurRadius: 30,
                  spreadRadius: 1,
                  inset: true,
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}