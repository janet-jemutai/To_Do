package com.jemutai.todoapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jemutai.todoapplication.databinding.ActivityToDoItemBinding

class ToDoAdapter(
    private  val todos :MutableList<ToDo>
) :RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    class ToDoViewHolder(val binding: ActivityToDoItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val binding = ActivityToDoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToDoViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return  todos.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val curToDo = todos[position]
        holder.binding.apply {
            tvToDoItem.text = curToDo.title
            cbDone.isChecked = curToDo.isChecked
        }
    }

}