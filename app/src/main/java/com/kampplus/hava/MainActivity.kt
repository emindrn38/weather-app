package com.kampplus.hava

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kampplus.hava.core.ui.theme.HavaTheme
import dagger.hilt.android.AndroidEntryPoint

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HavaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InfoCard(
                        title = "Hava Durumu",
                        description = "Bugün Bursa'da hava parçalı bulutlu.",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun InfoCard(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(text = title)
        Text(text = description)
    }
}

@Preview(showBackground = true)
@Composable
private fun InfoCardPreview() {
    HavaTheme {
        InfoCard(
            title = "Hava Durumu",
            description = "Bugün hava güneşli."
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InfoCardLongTextPreview() {
    HavaTheme {
        InfoCard(
            title = "Detaylı Hava Durumu",
            description = "Bugün hava sabah saatlerinde parçalı bulutlu olacak, öğleden sonra ise sıcaklık artacak ve akşam saatlerinde hafif rüzgar beklenmektedir."
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 280
)
@Composable
private fun InfoCardNarrowPreview() {
    HavaTheme {
        InfoCard(
            title = "Dar Ekran",
            description = "Bu içerik daha dar bir ekran genişliğinde nasıl davrandığını kontrol etmek için kullanılıyor."
        )
    }
}

@Preview(
    showBackground = true,
    fontScale = 1.5f
)
@Composable
private fun InfoCardLargeFontPreview() {
    HavaTheme {
        InfoCard(
            title = "Büyük Yazı",
            description = "Bu önizleme büyük yazı ölçeğinde yerleşimin bozulup bozulmadığını kontrol eder."
        )
    }
}
