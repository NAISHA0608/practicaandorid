package def.naisha.myapplication3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp // Import necesario para dp
import def.naisha.myapplication3.ui.theme.MyApplication3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Saludo()
        }
    }
}

@Composable
fun Saludo() {
    Column(
        modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
    ) {
        Text(
            text = "Hello"
        )
        Text(
            text = "Mi nombre es Naisha Ayovi"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSaludo() {
    MyApplication3Theme {
        Saludo()
    }
}
