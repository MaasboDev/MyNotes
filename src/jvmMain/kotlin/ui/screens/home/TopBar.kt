package ui.screens.home

import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import data.Filter
import data.Note.Type

@Composable
fun TopBar(onFilterClick: (Filter) -> Unit) {
    TopAppBar(
        title = { Text("My Notes") },
        actions = {
            FiltersAction(onFilterClick)
        }
    )
}

@Composable
private fun FiltersAction(onFilterClick: (Filter) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    IconButton(onClick = { expanded = true }) {

        Icon(imageVector = Icons.Default.FilterList, contentDescription = "Filter")

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            listOf(
                Filter.All to "All",
                Filter.ByType(Type.TEXT) to "Text",
                Filter.ByType(Type.AUDIO) to "Audio"
            ).forEach { (filter, label) ->
                DropdownMenuItem(onClick = {
                    expanded = false
                    onFilterClick(filter)
                }) {
                    Text(label)
                }
            }
        }
    }
}