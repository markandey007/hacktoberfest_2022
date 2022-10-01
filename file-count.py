'''
    Install matplotlib with: pip3 install matplotlib
'''

import os

# Import libraries
from matplotlib import pyplot as plt


def draw(data: dict):
    labels = [f'{key} ({value})' for key, value in data.items()]
    plt.pie(data.values(), labels=labels)

    # show plot
    plt.show()


def main():
    file_list = os.listdir('.')

    extension_map = {}

    # count files that don't have an extension
    for file in file_list:
        if '.' not in file:
            extension_map['no extension'] = extension_map.get(
                'no extension', 0) + 1

    # count files that have an extension
    for file in file_list:
        if '.' in file:
            extension = file.split('.')[-1]
            extension_map[extension] = extension_map.get(extension, 0) + 1

    # print results
    print('------------------')
    for extension, count in extension_map.items():
        print(f'{extension}: {count}')
        print('------------------')

    draw(extension_map)


if __name__ == "__main__":
    main()
