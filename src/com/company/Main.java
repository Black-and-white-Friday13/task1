package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() % 2 == 0)
            {
                list.add(i, list.get(i));
                i++;
            }
            else
            {
                list.add(i, list.get(i));
                list.add(i, list.get(i));
                i+=2;
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() % 2 == 0)
            {
                System.out.println(list.get(i) + " " + list.get(i));
                i++;
            }
            else
            {
                System.out.println(list.get(i) + " " + list.get(i) + " " + list.get(i));
                i+=2;
            }
        }
    }
}
