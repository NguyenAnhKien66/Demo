import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:flutter/src/widgets/placeholder.dart';

class nav_bottom  extends StatelessWidget {
  const nav_bottom({super.key,required this.idx});
  final idx;
  @override
  Widget build(BuildContext context) {
    return BottomNavigationBar(
      fixedColor: Colors.blueAccent,
    items: const[
        BottomNavigationBarItem(
          label: "Trang chủ", 
          icon: Icon(Icons.home)),
          BottomNavigationBarItem(
          label: "Ca nhan", 
          icon: Icon(Icons.account_circle)),
          BottomNavigationBarItem(
          label: "cua hang", 
          icon: Icon(Icons.store)),
          BottomNavigationBarItem(
          label: "gio hang", 
          icon: Icon(Icons.shopping_bag)),
        
    ],
    currentIndex: idx,
    onTap: (int indexOfItem){
          if(indexOfItem==0)
          {
            Navigator.popUntil(context, (route) => route.isFirst); 
            Navigator.pushNamed(context, '/');
          }
      }
    );
    
  }
}