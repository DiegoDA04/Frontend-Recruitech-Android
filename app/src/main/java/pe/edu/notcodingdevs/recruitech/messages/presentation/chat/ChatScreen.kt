@file:OptIn(ExperimentalMaterial3Api::class)


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import pe.edu.notcodingdevs.recruitech.messages.domain.model.Message
import pe.edu.notcodingdevs.recruitech.ui.theme.Blue40
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey20
import pe.edu.notcodingdevs.recruitech.ui.theme.Grey40

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "MutableCollectionMutableState")
@Composable
fun ChatScreen() {
    val messages = remember {
        mutableStateListOf(
            Message("Hola, Luis  como estas?", true),
            Message("Estoy Bien", false),
            Message("Hola, como estas?", false)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopContactBar()
        Box(
            contentAlignment = Alignment.BottomCenter, modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
        ) {
            ListMessages(messages)
            TextFieldBottomChat(messages)
        }
    }
}

@Composable
fun TextFieldBottomChat(messages: MutableList<Message>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val newMessage = remember {
            mutableStateOf(TextFieldValue())
        }
        OutlinedTextField(
            value = newMessage.value,
            onValueChange = { newMessage.value = it },
            modifier = Modifier
                .weight(4f)
                .padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            textStyle = MaterialTheme.typography.bodyMedium,
            placeholder = {
                Text(
                    text = "Write a message...",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Grey20
                )
            },
            singleLine = true,
            colors = TextFieldDefaults
                .outlinedTextFieldColors(
                    textColor = Grey40,
                    containerColor = Color.White,
                    placeholderColor = Grey20,
                    focusedLeadingIconColor = Grey40,
                    unfocusedLeadingIconColor = Grey20,
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color.Transparent,
                    focusedTrailingIconColor = Grey40,
                    unfocusedTrailingIconColor = Grey20,
                    cursorColor = Grey40
                )
        )
        Button(
            onClick = {
                messages.add(Message(newMessage.value.text, true))
            },
            modifier = Modifier
                .weight(1f)
                .height(70.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue40, contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 20.dp)
        ) {
            Icon(Icons.Default.Send, contentDescription = null, modifier = Modifier.size(30.dp))
        }
    }
}

@Composable
fun ListMessages(messages: MutableList<Message>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp),
        reverseLayout = true
    ) {
        // Reverse the list to show the latest messages at the bottom
        items(messages.reversed(), key = { message -> message.message }) { message ->
            MessageItem(message)
        }
    }
}

@Composable
fun MessageItem(message: Message) {
    if (message.fromMe) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            ElevatedCard(
                modifier = Modifier.padding(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE1F5FE)
                ),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {
                MessageText(message.message)
            }
        }
    } else {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            ElevatedCard(
                modifier = Modifier.padding(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {
                MessageText(message.message)
            }
        }
    }
}

@Composable
fun MessageText(message: String) {
    Text(
        text = message,
        modifier = Modifier.padding(16.dp),
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        color = Grey40
    )
}

@Composable
fun TopContactBar() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp), colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.LightGray),
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                Icons.Filled.ArrowBack,
                contentDescription = null,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )
            AsyncImage(
                model = null,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Gray, shape = RoundedCornerShape(50.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Luis",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun ChatPreview() {
    ChatScreen()
}
