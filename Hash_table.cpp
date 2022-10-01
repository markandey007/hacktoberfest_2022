#include <bits/stdc++.h>
#define SIZE 10
using namespace std;
class Client_DB;
class Client
{
private:
    int id;
    string Name;
    long long int Number;
    int next_prob;

public:
    Client()
    {
        id = -1;
        Name = "";
        Number = 0;
        next_prob = -1;
    }
    Client(int Client_id, string Client_Name, long int Client_Number)
    {
        Client_id = id;
        Client_Name = Name;
        Client_Number = Number;
    }
    void getData()
    {
        cout << "Enter the id of client is " << endl;
        cin >> id;
        cout << "Enter the Name of the client is " << endl;
        cin >> Name;
        cout << "Enter the Number of the client is " << endl;
        cin >> Number;
    }

    void showData()
    {
        cout << "The id of client is " << id << endl;

        cout << "The Name of the client is " << Name << endl;

        cout << "The Number of the client is " << Number << endl;
    }
    friend class Client_DB;
};

class Client_DB
{
    Client c;

private:
    Client HT[10]; // array of object
    int index;

public:
    int HashFunction(Client c)
    {
        int index = c.id % 10;
        return index;
    } // this will give us the indexx
    void insert_record()
    {
        c.getData();
        index = HashFunction(c); // index of the element that we've to insert
        if (HT[index].next_prob == -1)
        {
            cout << "No Collision Element Inserted at " << index << endl;
            HT[index] = c;
            HT[index].next_prob = index + 1; // when element is inserted in the hash table probe number will not remain -1
        }
        else
        {
            cout << "collision occured" << endl;
            int i = index;
            while (HT[i].next_prob != -1)
            {
                i = HT[i].next_prob; // here we have stored the index of last element which has some value other than -1
            }

            HT[i] = c;
            HT[i].next_prob = i + 1; // increament the probe
        }
    }
    void show()
    {
        cout << "_________________________________________________________________";
        cout << "\nIndex\tId\tName\t\tNumber\n";
        cout << "_________________________________________________________________\n";
        for (int i = 0; i < SIZE; i++)
        {

            cout << i << "\t" << HT[i].id << "\t" << HT[i].Name << "\t"
                 << "\t" << HT[i].Number << endl;
        }
        cout << "_________________________________________________________________\n";
    }

   

    void search()
    {
        int i, key;
        cout << "Enter the key to search: ";
        cin >> key;
        Client bt;
        bt.id = key;
        i = HashFunction(bt);
        while (key != HT[i].id || HT[i].next_prob != -1)
        {
            i = HT[i].next_prob; // here also we have stored the last element which have value other than -1
        }
        if (key == HT[i].id)
        {
            cout << "Client Data found" << endl;
            cout << "Name:" << HT[i].Name << endl;
            cout << "Number:" << HT[i].Number << endl;
            return;
        }
        cout << "Client ID Not Found!" << endl;
    }
    void delete_Bucket()
    {
        int i, key, flag = 0;
        cout << "Enter the key to : ";
        cin >> key;
        Client bt;
        bt.id = key;
        i = HashFunction(bt);
        for (int a = 0; a < SIZE; a++)
        {
            if (HT[i].id == key)
            {
                cout << "Deleting : " << HT[i].id;
                HT[i].id = -1;
                HT[i].Name = "";
                HT[i].Number = 0;
                HT[i].next_prob = -1;
                flag = 1;
                break;
            }
            else
            {
                i = (i + 1) % SIZE;
            }
        }
        if (flag == 0)
        {
            cout << "Record not found!!!";
        }
    }
};



int main()
{
    int y, s, choice;
    bool flag = true;
    Client_DB c;
    while (flag)
    {
        cout << "\n________________________LIST_____________________________________\n";
        cout << "\n1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit\n\n";
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            c.insert_record();
            cout << endl;
            break;
        case 2:

            c.search();
            cout << endl;
            break;
        case 3:
            c.delete_Bucket();
            cout << endl;
            break;
        case 4:
            c.show();
            cout << endl;
            break;
        case 5:
            break;
        }
        char flag2;
        cout << "Do you want to continue(y or n) :" << endl;
        cin >> flag2;
        if (flag2 == 'n')
        {
            flag = false;
        }
    }

    return 0;
}
