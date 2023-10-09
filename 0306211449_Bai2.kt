package com.example.caculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.contentValuesOf
import com.example.caculator.ui.theme.CaculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculator()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calculator( modifier: Modifier = Modifier) {
    var pt_a by remember { mutableStateOf("") }
    var pt_b by remember { mutableStateOf("") }
    var Result by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White
                ),
                title = {
                    Text(
                        text = "Máy tính",


                        )
                })
        })
    {
            it->
        Column(modifier= modifier
            .padding(it)
            .fillMaxSize()) {
            Spacer(modifier =modifier.padding(top=10.dp, bottom = 10.dp))
            TextField(
                modifier= modifier
                    .fillMaxWidth(),
                value=pt_a,
                onValueChange = {pt_a=it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors= TextFieldDefaults.textFieldColors(containerColor = Color.White),
                label={ Text(text = "Nhập vào số thứ nhất",color = Color.Gray)}


            )
            Spacer(modifier =modifier.padding(top=15.dp, bottom = 15.dp))
            TextField(
                modifier= modifier
                    .fillMaxWidth(),
                value=pt_b,
                onValueChange = {pt_b=it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors= TextFieldDefaults.textFieldColors(containerColor = Color.White),
                label={ Text(text = "Nhập vào số thứ hai", color = Color.Gray)},


                )
            Row(
                modifier=modifier.align(Alignment.CenterHorizontally),
            ) {
                Button(onClick = {

                    try {
                        var a=pt_a.toDouble()
                        var b=pt_b.toDouble()
                        var kq=a+b
                        Result= (kq).toString()

                    }
                    catch (e:Exception)
                    {
                        Result="Lỗi"
                    }
                },
                    colors=ButtonDefaults.buttonColors(Color.White)


                ) {
                    Icon(Icons.Rounded.Add,contentDescription = null, tint = Color.Blue)
                }
                //tru
                Button(onClick = {

                    try {
                        var a=pt_a.toDouble()
                        var b=pt_b.toDouble()
                        var kq=a-b
                        Result= (kq).toString()

                    }
                    catch (e:Exception)
                    {
                        Result="Lỗi"
                    }
                },
                    colors=ButtonDefaults.buttonColors(Color.White)


                ) {
                    Icon(Icons.Rounded.Delete,contentDescription = null, tint = Color.Blue)
                }
                //nhan
                Button(onClick = {

                    try {
                        var a=pt_a.toDouble()
                        var b=pt_b.toDouble()
                        var kq=a*b
                        Result= (kq).toString()

                    }
                    catch (e:Exception)
                    {
                        Result="Lỗi"
                    }
                },
                    colors=ButtonDefaults.buttonColors(Color.White)


                ) {
                    Icon(Icons.Rounded.Clear,contentDescription = null, tint = Color.Blue)
                }
                //chia
                Button(onClick = {

                    try {
                        var a=pt_a.toDouble()
                        var b=pt_b.toDouble()
                        var kq=a.toDouble()/b
                        Result= (kq).toString()

                    }
                    catch (e:Exception)
                    {
                        Result="Lỗi"
                    }
                },
                    colors=ButtonDefaults.buttonColors(Color.White)


                ) {
                    Icon(Icons.Rounded.Edit,contentDescription = null, tint = Color.Blue)
                }
            }
            Box(
                modifier=modifier.align(Alignment.CenterHorizontally)

            ){Text(text = "Kết quả:$Result")

            }



        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Calculator()
}