/**
 * enhanced Spinner with icons support
 * used in MainActivity to display flags of languages
 *
 * @author clyde
 * @version 1.1igti
 */
package com.example.primenumbers;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SpinnerIcons extends BaseAdapter {

    private Context context;
    private String[] languages;
    private int[] icons;

    /**
     * constructor for SpinnerIcons
     *
     * @param context
     * @param languages
     * @param icons additional parameter for icons
     */
    SpinnerIcons(Context context, String[] languages, int[] icons) {
        this.context = context;
        this.languages = languages;
        this.icons = icons;
    }

    /**
     * returns the number of items in the adapter
     *
     * @return the number of items in the adapter
     */
    @Override
    public int getCount() {
        return languages.length;
    }

    /**
     * returns Object representation of the item at the specified position
     *
     * @param position
     * @return
     */
    @Override
    public Object getItem(int position) {
        return languages[position];
    }

    /**
     * returns the ID for the item at the specified position
     *
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * returns the view for the item at the specified position
     *
     * @param position
     * @param convertView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_icons, parent, false);
        }

        ImageView icon = convertView.findViewById(R.id.icon);
        TextView text = convertView.findViewById(R.id.text);

        icon.setImageResource(icons[position]); // sets the icon for the item at the specified position
        text.setText(languages[position]);      // sets the text for the item at the specified position

        return convertView;                     // returns the view for the item at the specified position
    }
}

