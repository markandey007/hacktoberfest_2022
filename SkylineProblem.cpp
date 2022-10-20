// https://leetcode.com/problems/the-skyline-problem/

/*

Question :

A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.

The geometric information of each building is given in the array buildings where buildings[i] = [lefti, righti, heighti]:

lefti is the x coordinate of the left edge of the ith building.
righti is the x coordinate of the right edge of the ith building.
heighti is the height of the ith building.
You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.

The skyline should be represented as a list of "key points" sorted by their x-coordinate in the form [[x1,y1],[x2,y2],...]. Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list, which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost building ends. Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.

Note: There must be no consecutive horizontal lines of equal height in the output skyline. For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable; the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]

*/

/*


Solution approach :

For each X coordinate in the provided range, we need to figure out what is the maximum height
and all such (x, maxHeight) should be returned where there has been a change in height as compared
 to previous existing X. Thus, we start by storing each buildings' [left, -height] and [right, height]
coordinates and sort these coordinates. Now, storing -height for left side of building gives us the
ability to identify which all buildings are active for any given X and on encountering left of one
building and right of another building at the same (x,y) we will consider building with left side
first. Now iterate through sorted coordinates of building tops and maintain prevHeight and a
multiset of current active building heights start with a 0 in the multiset. Now if in the
stored coordinates we encounter -ve height we insert into the multiset and on encountering
+ve height we find and delete the height from height. Then if maxHeight at this
X coordinate(using current active building multiset) is same as prevHeight we do not
push to skyline else (i.e., there is a change in heights at this point) we push the
coordinate to the skyline.

*/

#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> getSkyline(vector<vector<int>> &buildings);

int main()
{
    int n;
    cin >> n;

    vector<vector<int>> buildings(n, vector<int>(3));
    for (auto &i : buildings)
        for (auto &j : i)
            cin >> j;

    vector<vector<int>> skyline = getSkyline(buildings);
    for (auto &i : skyline)
    {
        cout << "[ " << i[0] << ", " << i[1] << " ]"
             << "\n";
    }

    return 0;
}

vector<vector<int>> getSkyline(vector<vector<int>> &buildings)
{
    // use walls to record buildings; left wall is an insertion event, and right wall is a deletion event
    vector<vector<int>> ans;
    vector<pair<int, int>> xaxes; // first: x, second: height
    for (auto b : buildings)
    {
        xaxes.push_back(make_pair(b[0], -b[2]));
        xaxes.push_back(make_pair(b[1], b[2]));
    }
    sort(xaxes.begin(), xaxes.end()); // sort walls

    multiset<int> currActiveBuildings = {0};
    int skylinePrevHeight = 0;
    for (auto x : xaxes)
    {
        if (x.second < 0)
        {
            currActiveBuildings.insert(-x.second);
        }
        else
        {
            currActiveBuildings.erase(currActiveBuildings.find(x.second));
        }

        if (*currActiveBuildings.rbegin() != skylinePrevHeight)
        { // mark a skyline point if skylinePrevHeight changes
            ans.push_back({ x.first, skylinePrevHeight = *currActiveBuildings.rbegin() });
        }
    }

    return ans;
}