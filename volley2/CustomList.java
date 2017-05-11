package com.example.chethan.volley2;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by Chethan on 5/10/2017.
 */
//ArrayAdapter used to map array objects

public class CustomList extends ArrayAdapter<String> {
    private String[] id;
    private String[] name;
    private String[] email;
    private Activity context;


    public CustomList(Activity context, String[] ids, String[] names, String[] emails) {
        super(context, R.layout.list_view_layout, ids);
        this.context = context;
        this.id = ids;
        this.name = names;
        this.email = emails;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();//Instantiates a layout XML file into its corresponding View objects
        View listViewItem = inflater.inflate(R.layout.list_view_layout, null, true);
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.textViewEmail);

        textViewId.setText(id[position]);
        textViewName.setText(name[position]);
        textViewEmail.setText(email[position]);

        return listViewItem;
    }
}
